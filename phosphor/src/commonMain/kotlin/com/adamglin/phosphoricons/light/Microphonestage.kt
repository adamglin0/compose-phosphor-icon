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

public val LightGroup.Microphonestage: ImageVector
    get() {
        if (_microphonestage != null) {
            return _microphonestage!!
        }
        _microphonestage = Builder(name = "Microphonestage", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 18.0f)
                arcTo(69.94f, 69.94f, 0.0f, false, false, 98.74f, 98.0f)
                lineToRelative(-70.0f, 95.46f)
                arcToRelative(13.92f, 13.92f, 0.0f, false, false, 1.39f, 18.17f)
                lineToRelative(14.3f, 14.3f)
                arcToRelative(13.93f, 13.93f, 0.0f, false, false, 18.17f, 1.39f)
                lineToRelative(95.46f, -70.0f)
                arcTo(70.0f, 70.0f, 0.0f, true, false, 168.0f, 18.0f)
                close()
                moveTo(226.0f, 88.0f)
                arcToRelative(57.65f, 57.65f, 0.0f, false, true, -13.0f, 36.52f)
                lineTo(131.49f, 43.0f)
                arcTo(57.95f, 57.95f, 0.0f, false, true, 226.0f, 88.0f)
                close()
                moveTo(55.5f, 217.59f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.6f, -0.2f)
                lineTo(38.61f, 203.1f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.2f, -2.6f)
                lineToRelative(64.22f, -87.56f)
                arcToRelative(70.32f, 70.32f, 0.0f, false, false, 40.44f, 40.43f)
                close()
                moveTo(110.0f, 88.0f)
                arcToRelative(57.73f, 57.73f, 0.0f, false, true, 13.0f, -36.52f)
                lineTo(204.53f, 133.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, true, 110.0f, 88.0f)
                close()
                moveTo(108.25f, 147.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 8.49f)
                lineToRelative(-8.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -8.49f, -8.49f)
                lineToRelative(8.0f, -8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 108.26f, 147.74f)
                close()
            }
        }
        .build()
        return _microphonestage!!
    }

private var _microphonestage: ImageVector? = null
