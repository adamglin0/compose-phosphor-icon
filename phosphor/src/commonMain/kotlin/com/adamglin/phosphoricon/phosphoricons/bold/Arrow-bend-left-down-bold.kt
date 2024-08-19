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

public val BoldGroup.`Arrow-bend-left-down-bold`: ImageVector
    get() {
        if (`_arrow-bend-left-down-bold` != null) {
            return `_arrow-bend-left-down-bold`!!
        }
        `_arrow-bend-left-down-bold` = Builder(name = "Arrow-bend-left-down-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.0f, 32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, -84.0f, 84.0f)
                verticalLineToRelative(67.0f)
                lineToRelative(27.51f, -27.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(92.0f, 195.0f)
                verticalLineTo(128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 200.0f, 20.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 212.0f, 32.0f)
                close()
            }
        }
        .build()
        return `_arrow-bend-left-down-bold`!!
    }

private var `_arrow-bend-left-down-bold`: ImageVector? = null
