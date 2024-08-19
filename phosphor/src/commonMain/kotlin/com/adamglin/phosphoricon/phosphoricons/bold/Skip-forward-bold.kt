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

public val BoldGroup.`Skip-forward-bold`: ImageVector
    get() {
        if (`_skip-forward-bold` != null) {
            return `_skip-forward-bold`!!
        }
        `_skip-forward-bold` = Builder(name = "Skip-forward-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(62.0f)
                lineToRelative(-113.45f, -71.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 47.88f)
                verticalLineTo(208.12f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 74.55f, 225.0f)
                lineTo(188.0f, 154.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(68.0f, 200.73f)
                verticalLineTo(55.27f)
                lineTo(184.3f, 128.0f)
                close()
            }
        }
        .build()
        return `_skip-forward-bold`!!
    }

private var `_skip-forward-bold`: ImageVector? = null
