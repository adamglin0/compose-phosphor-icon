package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.43f, 62.05f)
                arcToRelative(19.93f, 19.93f, 0.0f, false, false, -9.06f, -12.38f)
                arcToRelative(205.51f, 205.51f, 0.0f, false, false, -212.74f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -6.7f, 27.48f)
                horizontalLineToRelative(0.0f)
                lineToRelative(96.0f, 157.26f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 34.2f, 0.0f)
                lineToRelative(96.0f, -157.26f)
                arcTo(19.82f, 19.82f, 0.0f, false, false, 243.43f, 62.05f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(180.93f, 180.93f, 0.0f, false, true, 90.45f, 24.14f)
                lineTo(210.0f, 82.0f)
                arcTo(164.15f, 164.15f, 0.0f, false, false, 46.0f, 82.0f)
                lineTo(37.55f, 68.14f)
                arcTo(180.93f, 180.93f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(83.88f, 144.06f)
                lineToRelative(-20.74f, -34.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 92.0f, 128.0f)
                arcTo(20.12f, 20.12f, 0.0f, false, true, 83.88f, 144.06f)
                close()
                moveTo(128.0f, 216.36f)
                lineTo(96.44f, 164.65f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 91.8f, 88.72f)
                arcToRelative(140.45f, 140.45f, 0.0f, false, true, 105.71f, 13.74f)
                lineToRelative(-8.95f, 14.66f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -45.75f, 75.0f)
                close()
                moveTo(148.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.0f, -18.32f)
                lineToRelative(-20.64f, 33.83f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 148.0f, 156.0f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
