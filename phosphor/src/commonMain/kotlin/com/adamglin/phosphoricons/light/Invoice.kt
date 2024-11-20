package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Invoice: ImageVector
    get() {
        if (_invoice != null) {
            return _invoice!!
        }
        _invoice = Builder(name = "Invoice", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(56.0f, 114.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, -20.0f)
                lineTo(40.0f, 94.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, -44.0f)
                horizontalLineToRelative(2.0f)
                lineTo(42.0f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(2.0f)
                lineTo(64.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(40.0f, 62.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 0.0f, 20.0f)
                lineTo(56.0f, 82.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 0.0f, 44.0f)
                lineTo(54.0f, 126.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(230.0f, 56.0f)
                lineTo(230.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(40.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(26.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(162.0f, 194.0f)
                lineTo(162.0f, 158.0f)
                lineTo(80.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(82.0f)
                lineTo(162.0f, 110.0f)
                lineTo(104.0f, 110.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(218.0f, 98.0f)
                lineTo(218.0f, 62.0f)
                lineTo(96.0f, 62.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(224.0f, 50.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 230.0f, 56.0f)
                close()
                moveTo(174.0f, 146.0f)
                horizontalLineToRelative(44.0f)
                lineTo(218.0f, 110.0f)
                lineTo(174.0f, 110.0f)
                close()
                moveTo(218.0f, 192.0f)
                lineTo(218.0f, 158.0f)
                lineTo(174.0f, 158.0f)
                verticalLineToRelative(36.0f)
                horizontalLineToRelative(42.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 218.0f, 192.0f)
                close()
            }
        }
        .build()
        return _invoice!!
    }

private var _invoice: ImageVector? = null
