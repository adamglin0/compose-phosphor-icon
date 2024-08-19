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

public val BoldGroup.`Cat-bold`: ImageVector
    get() {
        if (`_cat-bold` != null) {
            return `_cat-bold`!!
        }
        `_cat-bold` = Builder(name = "Cat-bold", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.65f, 29.53f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -21.79f, 4.34f)
                curveToRelative(-0.2f, 0.2f, -0.39f, 0.4f, -0.57f, 0.61f)
                lineToRelative(-15.0f, 17.3f)
                arcToRelative(115.34f, 115.34f, 0.0f, false, false, -116.5f, 0.0f)
                lineToRelative(-15.0f, -17.3f)
                curveToRelative(-0.18f, -0.21f, -0.37f, -0.41f, -0.57f, -0.61f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 48.0f)
                verticalLineToRelative(88.0f)
                curveToRelative(0.0f, 55.14f, 48.45f, 100.0f, 108.0f, 100.0f)
                reflectiveCurveToRelative(108.0f, -44.86f, 108.0f, -100.0f)
                lineTo(236.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 223.65f, 29.53f)
                close()
                moveTo(212.0f, 136.0f)
                curveToRelative(0.0f, 38.22f, -31.35f, 69.93f, -72.0f, 75.21f)
                lineTo(140.0f, 197.0f)
                lineToRelative(12.49f, -12.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(128.0f, 175.0f)
                lineToRelative(-7.51f, -7.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(116.0f, 197.0f)
                verticalLineToRelative(14.24f)
                curveToRelative(-40.65f, -5.28f, -72.0f, -37.0f, -72.0f, -75.21f)
                lineTo(44.0f, 58.74f)
                lineTo(58.54f, 75.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.21f, 1.76f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 96.0f, 65.74f)
                lineTo(96.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(120.0f, 60.35f)
                quadToRelative(4.0f, -0.35f, 8.0f, -0.35f)
                reflectiveQuadToRelative(8.0f, 0.35f)
                lineTo(136.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(160.0f, 65.74f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, 21.25f, 11.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.21f, -1.76f)
                lineTo(212.0f, 58.74f)
                close()
                moveTo(100.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(188.0f, 140.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 188.0f, 140.0f)
                close()
            }
        }
        .build()
        return `_cat-bold`!!
    }

private var `_cat-bold`: ImageVector? = null
