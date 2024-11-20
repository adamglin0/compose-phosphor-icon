package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Racquet: ImageVector
    get() {
        if (_racquet != null) {
            return _racquet!!
        }
        _racquet = Builder(name = "Racquet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 26.05f)
                curveTo(202.0f, -1.88f, 151.53f, 3.16f, 117.4f, 37.3f)
                curveToRelative(-31.79f, 31.79f, -38.33f, 77.77f, -16.51f, 106.49f)
                lineTo(71.33f, 173.35f)
                lineToRelative(-0.68f, -0.68f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.64f, 0.0f)
                lineTo(20.69f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, 22.64f)
                lineToRelative(12.69f, 12.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineTo(83.34f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                lineToRelative(-0.69f, -0.69f)
                lineToRelative(29.56f, -29.56f)
                curveToRelative(11.29f, 8.58f, 25.24f, 12.79f, 40.0f, 12.79f)
                curveToRelative(22.72f, 0.0f, 47.25f, -10.0f, 66.54f, -29.3f)
                curveTo(252.83f, 104.47f, 257.88f, 54.0f, 230.0f, 26.05f)
                close()
                moveTo(44.7f, 224.0f)
                lineTo(32.0f, 211.31f)
                lineTo(59.33f, 184.0f)
                lineToRelative(6.33f, 6.34f)
                horizontalLineToRelative(0.0f)
                lineTo(72.0f, 196.67f)
                close()
                moveTo(224.23f, 104.0f)
                lineTo(200.06f, 104.0f)
                verticalLineToRelative(-32.0f)
                horizontalLineToRelative(32.0f)
                arcTo(72.45f, 72.45f, 0.0f, false, true, 224.23f, 104.0f)
                close()
                moveTo(136.0f, 149.61f)
                arcTo(44.15f, 44.15f, 0.0f, false, true, 106.39f, 120.0f)
                lineTo(136.0f, 120.0f)
                close()
                moveTo(104.0f, 104.0f)
                arcToRelative(72.24f, 72.24f, 0.0f, false, true, 7.86f, -32.0f)
                lineTo(136.0f, 72.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(152.0f, 72.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-32.0f)
                close()
                moveTo(229.67f, 56.0f)
                lineTo(200.06f, 56.0f)
                lineTo(200.06f, 26.28f)
                arcToRelative(44.23f, 44.23f, 0.0f, false, true, 29.66f, 29.66f)
                close()
                moveTo(183.85f, 24.0f)
                horizontalLineToRelative(0.16f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(-32.0f)
                lineTo(152.01f, 31.76f)
                arcTo(72.47f, 72.47f, 0.0f, false, true, 183.9f, 23.9f)
                close()
                moveTo(136.0f, 42.06f)
                lineTo(136.0f, 55.94f)
                lineTo(122.16f, 55.94f)
                arcToRelative(89.72f, 89.72f, 0.0f, false, true, 6.56f, -7.32f)
                arcTo(93.17f, 93.17f, 0.0f, false, true, 136.0f, 42.06f)
                close()
                moveTo(152.0f, 151.98f)
                lineTo(152.0f, 120.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(24.16f)
                arcTo(72.24f, 72.24f, 0.0f, false, true, 152.05f, 152.0f)
                close()
                moveTo(200.0f, 133.84f)
                lineTo(200.0f, 120.0f)
                lineTo(214.0f, 120.0f)
                arcToRelative(91.62f, 91.62f, 0.0f, false, true, -6.56f, 7.32f)
                arcTo(89.64f, 89.64f, 0.0f, false, true, 200.06f, 133.84f)
                close()
            }
        }
        .build()
        return _racquet!!
    }

private var _racquet: ImageVector? = null
