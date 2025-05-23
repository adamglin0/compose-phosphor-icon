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

public val LightGroup.SkipBackCircle: ImageVector
    get() {
        if (_skipBackCircle != null) {
            return _skipBackCircle!!
        }
        _skipBackCircle = Builder(name = "SkipBackCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(162.91f, 82.75f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.09f, 0.16f)
                lineTo(102.0f, 117.17f)
                lineTo(102.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(102.0f, 138.83f)
                lineToRelative(54.82f, 34.26f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 166.0f, 168.0f)
                lineTo(166.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 162.91f, 82.75f)
                close()
                moveTo(154.0f, 157.17f)
                lineTo(107.32f, 128.0f)
                lineTo(154.0f, 98.83f)
                close()
            }
        }
        .build()
        return _skipBackCircle!!
    }

private var _skipBackCircle: ImageVector? = null
