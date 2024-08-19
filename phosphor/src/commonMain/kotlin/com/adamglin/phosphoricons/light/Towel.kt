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

public val LightGroup.Towel: ImageVector
    get() {
        if (_towel != null) {
            return _towel!!
        }
        _towel = Builder(name = "Towel", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 26.0f)
                horizontalLineTo(72.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 50.0f, 48.0f)
                verticalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineTo(176.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                verticalLineTo(48.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 20.0f, 0.0f)
                verticalLineTo(152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(48.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, false, 200.0f, 26.0f)
                close()
                moveTo(72.0f, 38.0f)
                horizontalLineTo(180.41f)
                arcTo(21.84f, 21.84f, 0.0f, false, false, 178.0f, 48.0f)
                verticalLineTo(186.0f)
                horizontalLineTo(62.0f)
                verticalLineTo(48.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 72.0f, 38.0f)
                close()
                moveTo(176.0f, 218.0f)
                horizontalLineTo(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(198.0f)
                horizontalLineTo(178.0f)
                verticalLineToRelative(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 176.0f, 218.0f)
                close()
            }
        }
        .build()
        return _towel!!
    }

private var _towel: ImageVector? = null
