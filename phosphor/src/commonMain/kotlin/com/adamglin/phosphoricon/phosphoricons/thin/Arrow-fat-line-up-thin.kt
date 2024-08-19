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

public val ThinGroup.`Arrow-fat-line-up-thin`: ImageVector
    get() {
        if (`_arrow-fat-line-up-thin` != null) {
            return `_arrow-fat-line-up-thin`!!
        }
        `_arrow-fat-line-up-thin` = Builder(name = "Arrow-fat-line-up-thin", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.83f, 117.17f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 124.0f)
                lineTo(76.0f, 124.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(180.0f, 124.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.83f, -6.83f)
                close()
                moveTo(176.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(60.0f)
                lineTo(84.0f, 180.0f)
                lineTo(84.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(41.66f, 116.0f)
                lineTo(128.0f, 29.66f)
                lineTo(214.34f, 116.0f)
                close()
                moveTo(180.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 216.0f)
                close()
            }
        }
        .build()
        return `_arrow-fat-line-up-thin`!!
    }

private var `_arrow-fat-line-up-thin`: ImageVector? = null
