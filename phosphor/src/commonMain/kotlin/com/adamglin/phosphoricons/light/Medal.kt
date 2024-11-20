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

public val LightGroup.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 96.0f)
                arcTo(86.0f, 86.0f, 0.0f, true, false, 74.0f, 162.87f)
                lineTo(74.0f, 240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.85f, 5.1f)
                arcTo(5.93f, 5.93f, 0.0f, false, false, 80.0f, 246.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.68f, -0.63f)
                lineTo(128.0f, 222.71f)
                lineToRelative(45.33f, 22.66f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 182.0f, 240.0f)
                lineTo(182.0f, 162.87f)
                arcTo(85.87f, 85.87f, 0.0f, false, false, 214.0f, 96.0f)
                close()
                moveTo(54.0f, 96.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, 74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 54.0f, 96.0f)
                close()
                moveTo(170.0f, 230.29f)
                lineToRelative(-39.33f, -19.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.36f, 0.0f)
                lineTo(86.0f, 230.29f)
                lineTo(86.0f, 171.0f)
                arcToRelative(85.75f, 85.75f, 0.0f, false, false, 84.0f, 0.0f)
                close()
                moveTo(128.0f, 150.0f)
                arcTo(54.0f, 54.0f, 0.0f, true, false, 74.0f, 96.0f)
                arcTo(54.06f, 54.06f, 0.0f, false, false, 128.0f, 150.0f)
                close()
                moveTo(128.0f, 54.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, true, 86.0f, 96.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 128.0f, 54.0f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
