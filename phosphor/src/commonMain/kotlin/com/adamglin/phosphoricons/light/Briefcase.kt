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

public val LightGroup.Briefcase: ImageVector
    get() {
        if (_briefcase != null) {
            return _briefcase!!
        }
        _briefcase = Builder(name = "Briefcase", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(112.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 106.0f, 112.0f)
                close()
                moveTo(230.0f, 72.0f)
                verticalLineTo(200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                horizontalLineTo(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                verticalLineTo(72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 58.0f)
                horizontalLineTo(82.0f)
                verticalLineTo(48.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, -22.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 22.0f, 22.0f)
                verticalLineTo(58.0f)
                horizontalLineToRelative(42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 72.0f)
                close()
                moveTo(94.0f, 58.0f)
                horizontalLineToRelative(68.0f)
                verticalLineTo(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                horizontalLineTo(104.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 94.0f, 48.0f)
                close()
                moveTo(38.0f, 72.0f)
                verticalLineToRelative(42.79f)
                arcTo(186.0f, 186.0f, 0.0f, false, false, 128.0f, 138.0f)
                arcToRelative(185.91f, 185.91f, 0.0f, false, false, 90.0f, -23.22f)
                verticalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(40.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 38.0f, 72.0f)
                close()
                moveTo(218.0f, 200.0f)
                verticalLineTo(128.37f)
                arcTo(198.12f, 198.12f, 0.0f, false, true, 128.0f, 150.0f)
                arcToRelative(198.05f, 198.05f, 0.0f, false, true, -90.0f, -21.62f)
                verticalLineTo(200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                horizontalLineTo(216.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 218.0f, 200.0f)
                close()
            }
        }
        .build()
        return _briefcase!!
    }

private var _briefcase: ImageVector? = null
