package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Skull: ImageVector
    get() {
        if (_skull != null) {
            return _skull!!
        }
        _skull = Builder(name = "Skull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(116.0f, 132.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 116.0f, 132.0f)
                close()
                moveTo(164.0f, 108.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 164.0f, 108.0f)
                close()
                moveTo(236.0f, 116.0f)
                curveToRelative(0.0f, 29.85f, -13.05f, 57.78f, -36.0f, 77.52f)
                lineTo(200.0f, 216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(76.0f, 236.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(56.0f, 193.52f)
                curveToRelative(-23.0f, -19.74f, -36.0f, -47.67f, -36.0f, -77.52f)
                curveTo(20.0f, 58.65f, 68.45f, 12.0f, 128.0f, 12.0f)
                reflectiveCurveTo(236.0f, 58.65f, 236.0f, 116.0f)
                close()
                moveTo(212.0f, 116.0f)
                curveToRelative(0.0f, -44.11f, -37.68f, -80.0f, -84.0f, -80.0f)
                reflectiveCurveTo(44.0f, 71.89f, 44.0f, 116.0f)
                curveToRelative(0.0f, 24.31f, 11.41f, 47.0f, 31.31f, 62.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 187.82f)
                lineTo(80.0f, 212.0f)
                lineTo(96.0f, 212.0f)
                lineTo(96.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(136.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(176.0f, 187.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 4.69f, -9.51f)
                curveTo(200.59f, 163.0f, 212.0f, 140.31f, 212.0f, 116.0f)
                close()
            }
        }
        .build()
        return _skull!!
    }

private var _skull: ImageVector? = null
