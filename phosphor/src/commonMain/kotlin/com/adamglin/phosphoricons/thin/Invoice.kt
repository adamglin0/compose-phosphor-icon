package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Invoice: ImageVector
    get() {
        if (_invoice != null) {
            return _invoice!!
        }
        _invoice = Builder(name = "Invoice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(56.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -40.0f)
                horizontalLineToRelative(4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(64.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(40.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(56.0f, 84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                lineTo(52.0f, 124.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                close()
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 152.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(164.0f, 196.0f)
                lineTo(164.0f, 156.0f)
                lineTo(80.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(84.0f)
                lineTo(164.0f, 108.0f)
                lineTo(104.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(220.0f, 100.0f)
                lineTo(220.0f, 60.0f)
                lineTo(96.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(224.0f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(172.0f, 148.0f)
                horizontalLineToRelative(48.0f)
                lineTo(220.0f, 108.0f)
                lineTo(172.0f, 108.0f)
                close()
                moveTo(220.0f, 192.0f)
                lineTo(220.0f, 156.0f)
                lineTo(172.0f, 156.0f)
                verticalLineToRelative(40.0f)
                horizontalLineToRelative(44.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 220.0f, 192.0f)
                close()
            }
        }
        .build()
        return _invoice!!
    }

private var _invoice: ImageVector? = null
