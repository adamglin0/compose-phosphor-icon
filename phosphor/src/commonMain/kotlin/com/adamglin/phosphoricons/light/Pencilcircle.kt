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

public val LightGroup.Pencilcircle: ImageVector
    get() {
        if (_pencilcircle != null) {
            return _pencilcircle!!
        }
        _pencilcircle = Builder(name = "Pencilcircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.12f, 55.87f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 55.88f, 200.12f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.12f, 55.87f)
                close()
                moveTo(106.0f, 134.0f)
                horizontalLineToRelative(44.0f)
                lineToRelative(14.1f, 30.56f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 128.0f, 174.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -36.11f, -9.46f)
                close()
                moveTo(111.54f, 122.0f)
                lineTo(128.0f, 86.32f)
                lineTo(144.47f, 122.0f)
                close()
                moveTo(134.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(15.64f)
                arcToRelative(89.26f, 89.26f, 0.0f, false, true, -36.0f, 10.14f)
                close()
                moveTo(86.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(25.78f)
                arcToRelative(89.26f, 89.26f, 0.0f, false, true, -36.0f, -10.14f)
                close()
                moveTo(191.64f, 191.64f)
                arcTo(92.76f, 92.76f, 0.0f, false, true, 182.0f, 200.0f)
                lineTo(182.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.55f, -2.51f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.9f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 74.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(92.76f, 92.76f, 0.0f, false, true, -9.64f, -8.37f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 127.28f, 0.0f)
                close()
            }
        }
        .build()
        return _pencilcircle!!
    }

private var _pencilcircle: ImageVector? = null
