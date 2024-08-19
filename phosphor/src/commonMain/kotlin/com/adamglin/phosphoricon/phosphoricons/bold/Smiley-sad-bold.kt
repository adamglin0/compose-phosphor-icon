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

public val BoldGroup.`Smiley-sad-bold`: ImageVector
    get() {
        if (`_smiley-sad-bold` != null) {
            return `_smiley-sad-bold`!!
        }
        `_smiley-sad-bold` = Builder(name = "Smiley-sad-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(76.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 108.0f)
                close()
                moveTo(180.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 108.0f)
                close()
                moveTo(176.74f, 165.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.48f, 14.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -58.52f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.48f, -14.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, 97.48f, 0.0f)
                close()
            }
        }
        .build()
        return `_smiley-sad-bold`!!
    }

private var `_smiley-sad-bold`: ImageVector? = null
