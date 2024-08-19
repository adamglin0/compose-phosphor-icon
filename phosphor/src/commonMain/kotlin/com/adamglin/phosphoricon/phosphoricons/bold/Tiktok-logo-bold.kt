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

public val BoldGroup.`Tiktok-logo-bold`: ImageVector
    get() {
        if (`_tiktok-logo-bold` != null) {
            return `_tiktok-logo-bold`!!
        }
        `_tiktok-logo-bold` = Builder(name = "Tiktok-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 68.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(128.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(116.0f, 156.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -22.85f, -14.47f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 130.69f)
                lineTo(100.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 85.9f, 76.19f)
                arcToRelative(79.35f, 79.35f, 0.0f, false, false, -47.08f, 27.74f)
                arcTo(81.84f, 81.84f, 0.0f, false, false, 20.0f, 156.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 160.0f, 0.0f)
                lineTo(180.0f, 122.67f)
                arcTo(107.47f, 107.47f, 0.0f, false, false, 224.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(236.0f, 80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 68.0f)
                close()
                moveTo(212.0f, 107.15f)
                arcToRelative(83.05f, 83.05f, 0.0f, false, true, -37.0f, -14.91f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 102.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -112.0f, 0.0f)
                arcToRelative(57.86f, 57.86f, 0.0f, false, true, 32.0f, -51.56f)
                lineTo(76.0f, 124.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 64.0f, 32.0f)
                lineTo(140.0f, 36.0f)
                horizontalLineToRelative(17.06f)
                arcTo(68.21f, 68.21f, 0.0f, false, false, 212.0f, 90.94f)
                close()
            }
        }
        .build()
        return `_tiktok-logo-bold`!!
    }

private var `_tiktok-logo-bold`: ImageVector? = null
