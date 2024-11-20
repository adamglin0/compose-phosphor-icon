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

public val ThinGroup.Dresser: ImageVector
    get() {
        if (_dresser != null) {
            return _dresser!!
        }
        _dresser = Builder(name = "Dresser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(140.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(120.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 192.0f)
                close()
                moveTo(120.0f, 68.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(120.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(136.0f, 124.0f)
                lineTo(120.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(212.0f, 40.0f)
                lineTo(212.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(56.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(44.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f)
                lineTo(200.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 40.0f)
                close()
                moveTo(52.0f, 156.0f)
                lineTo(204.0f, 156.0f)
                lineTo(204.0f, 100.0f)
                lineTo(52.0f, 100.0f)
                close()
                moveTo(52.0f, 40.0f)
                lineTo(52.0f, 92.0f)
                lineTo(204.0f, 92.0f)
                lineTo(204.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(56.0f, 36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 52.0f, 40.0f)
                close()
                moveTo(204.0f, 216.0f)
                lineTo(204.0f, 164.0f)
                lineTo(52.0f, 164.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(200.0f, 220.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 204.0f, 216.0f)
                close()
            }
        }
        .build()
        return _dresser!!
    }

private var _dresser: ImageVector? = null
