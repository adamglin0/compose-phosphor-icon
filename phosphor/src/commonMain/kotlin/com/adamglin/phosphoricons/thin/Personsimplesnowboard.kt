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

public val ThinGroup.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) {
            return _personSimpleSnowboard!!
        }
        _personSimpleSnowboard = Builder(name = "PersonSimpleSnowboard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 76.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 76.0f)
                close()
                moveTo(164.0f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 164.0f, 36.0f)
                close()
                moveTo(217.13f, 116.16f)
                lineTo(81.13f, 76.16f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.26f, 7.68f)
                lineToRelative(46.06f, 13.54f)
                lineTo(86.77f, 154.63f)
                lineTo(39.23f, 140.85f)
                arcToRelative(21.18f, 21.18f, 0.0f, true, false, -11.9f, 40.66f)
                horizontalLineToRelative(0.0f)
                lineToRelative(157.44f, 45.63f)
                arcToRelative(21.45f, 21.45f, 0.0f, false, false, 6.0f, 0.86f)
                arcToRelative(21.2f, 21.2f, 0.0f, false, false, 12.76f, -4.29f)
                arcToRelative(21.0f, 21.0f, 0.0f, false, false, 8.46f, -16.9f)
                arcToRelative(21.3f, 21.3f, 0.0f, false, false, -15.33f, -20.33f)
                lineToRelative(-56.15f, -16.27f)
                lineToRelative(22.8f, -34.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.44f, -3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.65f, -2.47f)
                lineTo(120.54f, 118.4f)
                lineTo(133.0f, 99.75f)
                lineToRelative(81.9f, 24.09f)
                arcTo(4.06f, 4.06f, 0.0f, false, false, 216.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.13f, -7.84f)
                close()
                moveTo(204.0f, 206.81f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, -5.26f, 10.5f)
                arcTo(13.25f, 13.25f, 0.0f, false, true, 187.0f, 219.46f)
                lineTo(29.55f, 173.82f)
                arcTo(13.26f, 13.26f, 0.0f, false, true, 20.0f, 161.18f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, true, 5.26f, -10.5f)
                arcTo(13.23f, 13.23f, 0.0f, false, true, 37.0f, 148.54f)
                lineToRelative(157.44f, 45.63f)
                arcTo(13.25f, 13.25f, 0.0f, false, true, 204.0f, 206.81f)
                close()
                moveTo(153.63f, 136.32f)
                lineTo(132.46f, 167.87f)
                lineTo(94.83f, 157.0f)
                lineToRelative(21.0f, -31.59f)
                close()
            }
        }
        .build()
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
