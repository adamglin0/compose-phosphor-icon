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

public val BoldGroup.`Arrow-bend-up-right-bold`: ImageVector
    get() {
        if (`_arrow-bend-up-right-bold` != null) {
            return `_arrow-bend-up-right-bold`!!
        }
        `_arrow-bend-up-right-bold` = Builder(name = "Arrow-bend-up-right-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.49f, 112.49f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(195.0f, 116.0f)
                horizontalLineTo(128.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, -84.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 128.0f, 92.0f)
                horizontalLineToRelative(67.0f)
                lineTo(167.51f, 64.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineToRelative(48.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.49f, 112.49f)
                close()
            }
        }
        .build()
        return `_arrow-bend-up-right-bold`!!
    }

private var `_arrow-bend-up-right-bold`: ImageVector? = null
