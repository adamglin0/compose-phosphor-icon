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

public val LightGroup.Circledashed: ImageVector
    get() {
        if (_circledashed != null) {
            return _circledashed!!
        }
        _circledashed = Builder(name = "Circledashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.19f, 36.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 4.3f, -7.31f)
                arcToRelative(102.12f, 102.12f, 0.0f, false, true, 51.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.0f, 11.62f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, false, -45.0f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 98.19f, 36.54f)
                close()
                moveTo(55.19f, 56.54f)
                arcTo(102.07f, 102.07f, 0.0f, false, false, 29.7f, 100.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.19f, 7.38f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, 1.6f, 0.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.78f, -4.4f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 63.78f, 65.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -8.56f, -8.41f)
                close()
                moveTo(41.28f, 152.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -11.56f, 3.2f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 25.49f, 44.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.55f, -8.41f)
                arcTo(90.11f, 90.11f, 0.0f, false, true, 41.28f, 152.09f)
                close()
                moveTo(150.49f, 215.15f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.0f, 11.62f)
                arcToRelative(102.16f, 102.16f, 0.0f, false, false, 51.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.0f, -11.62f)
                close()
                moveTo(222.11f, 147.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.38f, 4.18f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -22.51f, 39.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.56f, 8.41f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 226.3f, 155.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 222.11f, 147.92f)
                close()
                moveTo(214.72f, 103.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.78f, 4.4f)
                arcToRelative(5.88f, 5.88f, 0.0f, false, false, 1.6f, -0.22f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.18f, -7.38f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, -25.49f, -44.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.55f, 8.41f)
                arcTo(90.05f, 90.05f, 0.0f, false, true, 214.72f, 103.91f)
                close()
            }
        }
        .build()
        return _circledashed!!
    }

private var _circledashed: ImageVector? = null
