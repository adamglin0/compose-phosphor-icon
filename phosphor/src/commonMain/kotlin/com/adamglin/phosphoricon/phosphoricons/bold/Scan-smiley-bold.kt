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

public val BoldGroup.`Scan-smiley-bold`: ImageVector
    get() {
        if (`_scan-smiley-bold` != null) {
            return `_scan-smiley-bold`!!
        }
        `_scan-smiley-bold` = Builder(name = "Scan-smiley-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 40.0f)
                lineTo(228.0f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 52.0f)
                lineTo(188.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 40.0f)
                close()
                moveTo(216.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(16.0f)
                lineTo(188.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 188.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 176.0f)
                close()
                moveTo(68.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(68.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(40.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 68.0f)
                lineTo(52.0f, 52.0f)
                lineTo(68.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f)
                lineTo(28.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 80.0f)
                close()
                moveTo(128.0f, 208.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 80.0f, -80.0f)
                arcTo(80.09f, 80.09f, 0.0f, false, true, 128.0f, 208.0f)
                close()
                moveTo(184.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, -56.0f, 56.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 184.0f, 128.0f)
                close()
                moveTo(104.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 104.0f)
                close()
                moveTo(152.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 152.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_scan-smiley-bold`!!
    }

private var `_scan-smiley-bold`: ImageVector? = null
