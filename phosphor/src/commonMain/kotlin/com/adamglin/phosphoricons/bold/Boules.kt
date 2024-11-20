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

public val BoldGroup.Boules: ImageVector
    get() {
        if (_boules != null) {
            return _boules!!
        }
        _boules = Builder(name = "Boules", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(178.28f, 60.75f)
                lineTo(60.75f, 178.28f)
                arcToRelative(84.87f, 84.87f, 0.0f, false, true, -8.36f, -13.7f)
                lineTo(164.58f, 52.39f)
                arcTo(84.87f, 84.87f, 0.0f, false, true, 178.28f, 60.75f)
                close()
                moveTo(195.28f, 77.75f)
                arcToRelative(84.87f, 84.87f, 0.0f, false, true, 8.36f, 13.7f)
                lineTo(91.42f, 203.61f)
                arcToRelative(84.87f, 84.87f, 0.0f, false, true, -13.7f, -8.36f)
                close()
                moveTo(128.0f, 44.0f)
                arcToRelative(84.53f, 84.53f, 0.0f, false, true, 10.37f, 0.66f)
                lineTo(44.66f, 138.37f)
                arcTo(83.87f, 83.87f, 0.0f, false, true, 128.0f, 44.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.53f, 84.53f, 0.0f, false, true, -10.37f, -0.66f)
                lineToRelative(93.71f, -93.71f)
                arcTo(83.87f, 83.87f, 0.0f, false, true, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _boules!!
    }

private var _boules: ImageVector? = null
