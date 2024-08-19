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

public val BoldGroup.`File-cloud-bold`: ImageVector
    get() {
        if (`_file-cloud-bold` != null) {
            return `_file-cloud-bold`!!
        }
        `_file-cloud-bold` = Builder(name = "File-cloud-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.49f, 79.52f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                lineTo(196.0f, 212.0f)
                lineTo(180.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.49f, 79.52f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
                moveTo(108.0f, 124.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -50.65f, 32.09f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 60.0f, 236.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 0.0f, -112.0f)
                close()
                moveTo(108.0f, 212.0f)
                lineTo(60.0f, 212.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -6.54f, -30.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.67f, -4.32f)
                arcToRelative(32.78f, 32.78f, 0.0f, false, true, 0.92f, -5.3f)
                curveToRelative(0.12f, -0.36f, 0.22f, -0.72f, 0.31f, -1.09f)
                arcTo(32.0f, 32.0f, 0.0f, true, true, 108.0f, 212.0f)
                close()
            }
        }
        .build()
        return `_file-cloud-bold`!!
    }

private var `_file-cloud-bold`: ImageVector? = null
