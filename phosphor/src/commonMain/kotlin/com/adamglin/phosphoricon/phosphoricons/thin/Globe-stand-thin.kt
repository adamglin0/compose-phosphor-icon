package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Globe-stand-thin`: ImageVector
    get() {
        if (`_globe-stand-thin` != null) {
            return `_globe-stand-thin`!!
        }
        `_globe-stand-thin` = Builder(name = "Globe-stand-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 180.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, -76.0f, -76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, false, 136.0f, 180.0f)
                close()
                moveTo(136.0f, 36.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, true, -68.0f, 68.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 136.0f, 36.0f)
                close()
                moveTo(210.89f, 176.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.12f, 5.65f)
                arcToRelative(107.31f, 107.31f, 0.0f, false, true, -70.77f, 30.0f)
                lineTo(140.0f, 236.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(104.0f, 244.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                lineTo(132.0f, 211.92f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 58.06f, 29.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.77f, 5.54f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 141.4f, 141.39f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 210.89f, 176.28f)
                close()
            }
        }
        .build()
        return `_globe-stand-thin`!!
    }

private var `_globe-stand-thin`: ImageVector? = null
