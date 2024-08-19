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

public val BoldGroup.`Thermometer-cold-bold`: ImageVector
    get() {
        if (`_thermometer-cold-bold` != null) {
            return `_thermometer-cold-bold`!!
        }
        `_thermometer-cold-bold` = Builder(name = "Thermometer-cold-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 56.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 56.0f, 56.0f)
                verticalLineToRelative(94.69f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 104.0f, 0.0f)
                close()
                moveTo(108.0f, 228.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -30.91f, -65.39f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 80.0f, 154.78f)
                verticalLineTo(56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(98.77f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.77f, 7.68f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 108.0f, 228.0f)
                close()
                moveTo(246.14f, 81.52f)
                lineToRelative(-14.72f, 4.79f)
                lineToRelative(9.1f, 12.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.42f, 14.11f)
                lineTo(212.0f, 100.42f)
                lineToRelative(-9.1f, 12.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.42f, -14.11f)
                lineToRelative(9.1f, -12.52f)
                lineToRelative(-14.72f, -4.79f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.41f, -22.82f)
                lineTo(200.0f, 63.48f)
                verticalLineTo(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineTo(63.48f)
                lineToRelative(14.73f, -4.78f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 7.41f, 22.82f)
                close()
                moveTo(132.0f, 188.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -36.0f, -20.78f)
                verticalLineTo(132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(35.22f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 132.0f, 188.0f)
                close()
            }
        }
        .build()
        return `_thermometer-cold-bold`!!
    }

private var `_thermometer-cold-bold`: ImageVector? = null
