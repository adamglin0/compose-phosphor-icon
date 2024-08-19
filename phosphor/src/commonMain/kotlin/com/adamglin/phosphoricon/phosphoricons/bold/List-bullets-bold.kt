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

public val BoldGroup.`List-bullets-bold`: ImageVector
    get() {
        if (`_list-bullets-bold` != null) {
            return `_list-bullets-bold`!!
        }
        `_list-bullets-bold` = Builder(name = "List-bullets-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(88.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 64.0f)
                close()
                moveTo(216.0f, 116.0f)
                lineTo(88.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(216.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(216.0f, 180.0f)
                lineTo(88.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 44.0f, 112.0f)
                close()
                moveTo(44.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, false, 60.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 44.0f, 48.0f)
                close()
                moveTo(44.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 44.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_list-bullets-bold`!!
    }

private var `_list-bullets-bold`: ImageVector? = null
