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

public val BoldGroup.`Pix-logo-bold`: ImageVector
    get() {
        if (`_pix-logo-bold` != null) {
            return `_pix-logo-bold`!!
        }
        `_pix-logo-bold` = Builder(name = "Pix-logo-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.16f, 113.89f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.22f, 0.0f)
                lineToRelative(-96.0f, 96.05f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.22f)
                lineToRelative(96.05f, 96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.22f, 0.0f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.22f)
                close()
                moveTo(128.0f, 37.68f)
                lineTo(174.32f, 84.0f)
                horizontalLineTo(160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.49f, 3.51f)
                lineTo(128.0f, 111.0f)
                lineTo(104.49f, 87.51f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 84.0f)
                horizontalLineTo(81.68f)
                close()
                moveTo(57.68f, 108.0f)
                horizontalLineTo(91.0f)
                lineToRelative(20.0f, 20.0f)
                lineTo(91.0f, 148.0f)
                horizontalLineTo(57.68f)
                lineToRelative(-20.0f, -20.0f)
                close()
                moveTo(128.0f, 218.32f)
                lineTo(81.68f, 172.0f)
                horizontalLineTo(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.49f, -3.51f)
                lineTo(128.0f, 145.0f)
                lineToRelative(23.51f, 23.52f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 172.0f)
                horizontalLineToRelative(14.32f)
                close()
                moveTo(198.32f, 148.0f)
                horizontalLineTo(165.0f)
                lineToRelative(-20.0f, -20.0f)
                lineToRelative(20.0f, -20.0f)
                horizontalLineToRelative(33.35f)
                lineToRelative(20.0f, 20.0f)
                close()
            }
        }
        .build()
        return `_pix-logo-bold`!!
    }

private var `_pix-logo-bold`: ImageVector? = null
