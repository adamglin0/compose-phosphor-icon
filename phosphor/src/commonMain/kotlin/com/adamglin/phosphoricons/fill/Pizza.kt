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

public val FillGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.54f, 63.0f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, -7.25f, -9.9f)
                arcToRelative(201.49f, 201.49f, 0.0f, false, false, -208.58f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -5.37f, 22.0f)
                lineToRelative(96.0f, 157.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 27.36f, 0.0f)
                lineToRelative(96.0f, -157.27f)
                arcTo(15.82f, 15.82f, 0.0f, false, false, 239.54f, 63.0f)
                close()
                moveTo(184.44f, 131.53f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -41.38f, 67.77f)
                lineTo(128.0f, 224.0f)
                lineTo(96.5f, 172.43f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -41.35f, -67.76f)
                lineTo(48.8f, 94.26f)
                arcToRelative(152.0f, 152.0f, 0.0f, false, true, 158.39f, 0.0f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
