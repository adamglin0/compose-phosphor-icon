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

public val BoldGroup.`Binary-bold`: ImageVector
    get() {
        if (`_binary-bold` != null) {
            return `_binary-bold`!!
        }
        `_binary-bold` = Builder(name = "Binary-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 24.0f)
                curveTo(68.45f, 24.0f, 52.0f, 43.74f, 52.0f, 72.0f)
                reflectiveCurveToRelative(16.45f, 48.0f, 40.0f, 48.0f)
                reflectiveCurveToRelative(40.0f, -19.74f, 40.0f, -48.0f)
                reflectiveCurveTo(115.55f, 24.0f, 92.0f, 24.0f)
                close()
                moveTo(92.0f, 96.0f)
                curveTo(76.45f, 96.0f, 76.0f, 74.46f, 76.0f, 72.0f)
                reflectiveCurveToRelative(0.45f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 21.54f, 16.0f, 24.0f)
                reflectiveCurveTo(107.55f, 96.0f, 92.0f, 96.0f)
                close()
                moveTo(145.27f, 53.37f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.36f, -16.1f)
                lineToRelative(24.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 36.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(168.0f, 55.42f)
                lineToRelative(-6.63f, 3.31f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 145.27f, 53.37f)
                close()
                moveTo(164.0f, 136.0f)
                curveToRelative(-23.55f, 0.0f, -40.0f, 19.74f, -40.0f, 48.0f)
                reflectiveCurveToRelative(16.45f, 48.0f, 40.0f, 48.0f)
                reflectiveCurveToRelative(40.0f, -19.74f, 40.0f, -48.0f)
                reflectiveCurveTo(187.55f, 136.0f, 164.0f, 136.0f)
                close()
                moveTo(164.0f, 208.0f)
                curveToRelative(-15.55f, 0.0f, -16.0f, -21.54f, -16.0f, -24.0f)
                reflectiveCurveToRelative(0.45f, -24.0f, 16.0f, -24.0f)
                reflectiveCurveToRelative(16.0f, 21.54f, 16.0f, 24.0f)
                reflectiveCurveTo(179.55f, 208.0f, 164.0f, 208.0f)
                close()
                moveTo(104.0f, 148.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(80.0f, 167.42f)
                lineToRelative(-6.63f, 3.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -10.74f, -21.46f)
                lineToRelative(24.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 148.0f)
                close()
            }
        }
        .build()
        return `_binary-bold`!!
    }

private var `_binary-bold`: ImageVector? = null
