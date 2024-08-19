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

public val BoldGroup.`Scan-bold`: ImageVector
    get() {
        if (`_scan-bold` != null) {
            return `_scan-bold`!!
        }
        `_scan-bold` = Builder(name = "Scan-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 40.0f)
                lineTo(228.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 52.0f)
                lineTo(176.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 40.0f)
                close()
                moveTo(80.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(216.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(28.0f)
                lineTo(176.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 164.0f)
                close()
                moveTo(40.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 80.0f)
                lineTo(52.0f, 52.0f)
                lineTo(80.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f)
                lineTo(28.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 92.0f)
                close()
                moveTo(84.0f, 72.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(84.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(72.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 72.0f)
                close()
                moveTo(96.0f, 160.0f)
                horizontalLineToRelative(64.0f)
                lineTo(160.0f, 96.0f)
                lineTo(96.0f, 96.0f)
                close()
            }
        }
        .build()
        return `_scan-bold`!!
    }

private var `_scan-bold`: ImageVector? = null
