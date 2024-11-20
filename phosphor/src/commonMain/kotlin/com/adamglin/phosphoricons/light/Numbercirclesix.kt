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

public val LightGroup.NumberCircleSix: ImageVector
    get() {
        if (_numberCircleSix != null) {
            return _numberCircleSix!!
        }
        _numberCircleSix = Builder(name = "NumberCircleSix", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(128.0f, 114.0f)
                arcToRelative(34.5f, 34.5f, 0.0f, false, false, -5.6f, 0.47f)
                lineToRelative(18.75f, -31.39f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.3f, -6.16f)
                lineToRelative(-32.24f, 54.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 128.0f, 114.0f)
                close()
                moveTo(128.0f, 170.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 128.0f, 170.0f)
                close()
            }
        }
        .build()
        return _numberCircleSix!!
    }

private var _numberCircleSix: ImageVector? = null
