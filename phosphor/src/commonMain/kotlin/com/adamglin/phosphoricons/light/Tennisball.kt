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

public val LightGroup.Tennisball: ImageVector
    get() {
        if (_tennisball != null) {
            return _tennisball!!
        }
        _tennisball = Builder(name = "Tennisball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.16f, 55.88f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, 0.0f, 144.24f)
                arcTo(101.4f, 101.4f, 0.0f, false, false, 200.16f, 55.88f)
                close()
                moveTo(64.33f, 64.36f)
                arcToRelative(89.62f, 89.62f, 0.0f, false, true, 57.25f, -26.07f)
                arcTo(89.32f, 89.32f, 0.0f, false, true, 95.46f, 95.47f)
                arcToRelative(89.38f, 89.38f, 0.0f, false, true, -57.21f, 26.11f)
                arcTo(89.61f, 89.61f, 0.0f, false, true, 64.33f, 64.36f)
                close()
                moveTo(38.2f, 133.63f)
                arcTo(101.36f, 101.36f, 0.0f, false, false, 104.0f, 104.0f)
                arcToRelative(101.24f, 101.24f, 0.0f, false, false, 29.68f, -65.72f)
                arcToRelative(89.76f, 89.76f, 0.0f, false, true, 84.17f, 84.13f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -95.43f, 95.39f)
                arcTo(89.76f, 89.76f, 0.0f, false, true, 38.2f, 133.63f)
                close()
                moveTo(191.67f, 191.63f)
                arcToRelative(89.63f, 89.63f, 0.0f, false, true, -57.25f, 26.06f)
                arcToRelative(89.94f, 89.94f, 0.0f, false, true, 83.33f, -83.28f)
                arcTo(89.61f, 89.61f, 0.0f, false, true, 191.67f, 191.64f)
                close()
            }
        }
        .build()
        return _tennisball!!
    }

private var _tennisball: ImageVector? = null
