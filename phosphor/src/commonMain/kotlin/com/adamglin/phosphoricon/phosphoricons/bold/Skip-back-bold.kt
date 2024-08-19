package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Skip-back-bold`: ImageVector
    get() {
        if (`_skip-back-bold` != null) {
            return `_skip-back-bold`!!
        }
        `_skip-back-bold` = Builder(name = "Skip-back-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.75f, 30.52f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.3f, 0.53f)
                lineTo(68.0f, 102.0f)
                verticalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(154.0f)
                lineToRelative(113.45f, 71.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 212.0f, 208.12f)
                verticalLineTo(47.88f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 201.75f, 30.52f)
                close()
                moveTo(188.0f, 200.73f)
                lineTo(71.7f, 128.0f)
                lineTo(188.0f, 55.27f)
                close()
            }
        }
        .build()
        return `_skip-back-bold`!!
    }

private var `_skip-back-bold`: ImageVector? = null
