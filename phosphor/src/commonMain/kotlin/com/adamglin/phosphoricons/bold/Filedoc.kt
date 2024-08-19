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

public val BoldGroup.Filedoc: ImageVector
    get() {
        if (_filedoc != null) {
            return _filedoc!!
        }
        _filedoc = Builder(name = "Filedoc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 140.0f)
                lineTo(32.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                close()
                moveTo(48.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 164.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(228.3f, 192.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.37f, 17.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 204.0f, 220.0f)
                curveToRelative(-19.85f, 0.0f, -36.0f, -17.94f, -36.0f, -40.0f)
                reflectiveCurveToRelative(16.15f, -40.0f, 36.0f, -40.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 24.67f, 10.83f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.34f, 16.6f)
                arcTo(10.27f, 10.27f, 0.0f, false, false, 204.0f, 164.0f)
                curveToRelative(-6.5f, 0.0f, -12.0f, 7.33f, -12.0f, 16.0f)
                reflectiveCurveToRelative(5.5f, 16.0f, 12.0f, 16.0f)
                arcToRelative(10.27f, 10.27f, 0.0f, false, false, 7.33f, -3.43f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.3f, 192.2f)
                close()
                moveTo(128.0f, 140.0f)
                curveToRelative(-19.85f, 0.0f, -36.0f, 17.94f, -36.0f, 40.0f)
                reflectiveCurveToRelative(16.15f, 40.0f, 36.0f, 40.0f)
                reflectiveCurveToRelative(36.0f, -17.94f, 36.0f, -40.0f)
                reflectiveCurveTo(147.85f, 140.0f, 128.0f, 140.0f)
                close()
                moveTo(128.0f, 196.0f)
                curveToRelative(-6.5f, 0.0f, -12.0f, -7.33f, -12.0f, -16.0f)
                reflectiveCurveToRelative(5.5f, -16.0f, 12.0f, -16.0f)
                reflectiveCurveToRelative(12.0f, 7.33f, 12.0f, 16.0f)
                reflectiveCurveTo(134.5f, 196.0f, 128.0f, 196.0f)
                close()
                moveTo(48.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(60.0f, 44.0f)
                horizontalLineToRelative(76.0f)
                lineTo(136.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(220.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.51f, -8.48f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 20.0f)
                lineTo(56.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 36.0f, 40.0f)
                verticalLineToRelative(68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 48.0f, 120.0f)
                close()
                moveTo(160.0f, 57.0f)
                lineToRelative(23.0f, 23.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _filedoc!!
    }

private var _filedoc: ImageVector? = null
