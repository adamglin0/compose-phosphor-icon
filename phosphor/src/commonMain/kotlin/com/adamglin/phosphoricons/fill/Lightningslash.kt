package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.LightningSlash: ImageVector
    get() {
        if (_lightningSlash != null) {
            return _lightningSlash!!
        }
        _lightningSlash = Builder(name = "LightningSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.72f, 67.81f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.42f)
                lineToRelative(48.39f, -51.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.7f, 7.0f)
                lineTo(153.18f, 90.9f)
                lineToRelative(57.43f, 21.53f)
                arcToRelative(8.24f, 8.24f, 0.0f, false, true, 4.22f, 3.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, 9.63f)
                lineToRelative(-25.27f, 27.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.88f, 0.0f)
                close()
                moveTo(133.48f, 122.13f)
                lineTo(53.92f, 34.62f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 42.08f, 45.38f)
                lineTo(81.34f, 88.56f)
                lineToRelative(-39.0f, 41.83f)
                arcTo(8.15f, 8.15f, 0.0f, false, false, 40.0f, 135.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.16f, 8.18f)
                lineToRelative(57.63f, 21.61f)
                lineTo(88.16f, 238.43f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.69f, 7.0f)
                lineToRelative(61.86f, -66.28f)
                lineToRelative(38.37f, 42.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 11.84f, -10.76f)
                close()
            }
        }
        .build()
        return _lightningSlash!!
    }

private var _lightningSlash: ImageVector? = null
