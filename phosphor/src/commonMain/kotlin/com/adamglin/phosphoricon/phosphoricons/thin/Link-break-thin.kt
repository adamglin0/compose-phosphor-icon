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

public val ThinGroup.`Link-break-thin`: ImageVector
    get() {
        if (`_link-break-thin` != null) {
            return `_link-break-thin`!!
        }
        `_link-break-thin` = Builder(name = "Link-break-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.46f, 54.54f)
                arcToRelative(36.06f, 36.06f, 0.0f, false, false, -50.92f, 0.0f)
                lineTo(138.89f, 66.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.78f, -5.52f)
                lineTo(144.82f, 49.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 62.29f, 62.15f)
                lineToRelative(-12.35f, 11.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.52f, -5.78f)
                lineToRelative(12.28f, -11.72f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 201.46f, 54.54f)
                close()
                moveTo(117.11f, 189.24f)
                lineTo(105.46f, 201.46f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -51.0f, -50.85f)
                lineToRelative(12.28f, -11.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.52f, -5.78f)
                lineTo(48.89f, 144.89f)
                arcTo(44.0f, 44.0f, 0.0f, true, false, 111.18f, 207.0f)
                lineToRelative(11.71f, -12.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.78f, -5.52f)
                close()
                moveTo(216.0f, 156.0f)
                lineTo(192.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(40.0f, 100.0f)
                lineTo(64.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(40.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(160.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(164.0f, 192.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 188.0f)
                close()
                moveTo(96.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(100.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(92.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 96.0f, 68.0f)
                close()
            }
        }
        .build()
        return `_link-break-thin`!!
    }

private var `_link-break-thin`: ImageVector? = null
