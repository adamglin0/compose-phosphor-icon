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

public val LightGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.14f, 62.17f)
                arcTo(33.88f, 33.88f, 0.0f, false, false, 206.0f, 50.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -62.81f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.23f, 2.54f)
                lineTo(72.56f, 143.0f)
                arcToRelative(2.06f, 2.06f, 0.0f, false, true, -2.55f, 0.23f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 50.0f, 206.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 62.81f, -20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.23f, -2.54f)
                lineToRelative(70.4f, -70.4f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.54f, -0.23f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, 44.15f, -50.65f)
                close()
                moveTo(220.6f, 98.48f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -28.24f, 4.17f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -17.4f, 1.92f)
                lineTo(104.57f, 175.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -1.92f, 17.4f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -40.41f, 8.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.93f, -6.93f)
                arcToRelative(7.28f, 7.28f, 0.0f, false, false, -0.93f, 0.07f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 8.26f, -40.41f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 81.0f, 151.43f)
                lineTo(151.43f, 81.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 1.92f, -17.4f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 40.41f, -8.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.86f, 6.86f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, 20.0f, 36.24f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
