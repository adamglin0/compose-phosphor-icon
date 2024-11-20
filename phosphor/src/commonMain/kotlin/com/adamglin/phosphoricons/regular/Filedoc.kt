package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) {
            return _fileDoc!!
        }
        _fileDoc = Builder(name = "FileDoc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.0f, 144.0f)
                lineTo(36.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(52.0f, 216.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, -72.0f)
                close()
                moveTo(52.0f, 200.0f)
                lineTo(44.0f, 200.0f)
                lineTo(44.0f, 160.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                close()
                moveTo(221.53f, 195.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.25f, 11.31f)
                arcTo(30.06f, 30.06f, 0.0f, false, true, 200.0f, 216.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f)
                reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f)
                arcToRelative(30.06f, 30.06f, 0.0f, false, true, 21.78f, 9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.56f, 11.06f)
                arcTo(14.24f, 14.24f, 0.0f, false, false, 200.0f, 160.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, 9.0f, -16.0f, 20.0f)
                reflectiveCurveToRelative(7.18f, 20.0f, 16.0f, 20.0f)
                arcToRelative(14.24f, 14.24f, 0.0f, false, false, 10.22f, -4.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 221.53f, 195.09f)
                close()
                moveTo(128.0f, 144.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, 16.15f, -32.0f, 36.0f)
                reflectiveCurveToRelative(14.35f, 36.0f, 32.0f, 36.0f)
                reflectiveCurveToRelative(32.0f, -16.15f, 32.0f, -36.0f)
                reflectiveCurveTo(145.65f, 144.0f, 128.0f, 144.0f)
                close()
                moveTo(128.0f, 200.0f)
                curveToRelative(-8.82f, 0.0f, -16.0f, -9.0f, -16.0f, -20.0f)
                reflectiveCurveToRelative(7.18f, -20.0f, 16.0f, -20.0f)
                reflectiveCurveToRelative(16.0f, 9.0f, 16.0f, 20.0f)
                reflectiveCurveTo(136.82f, 200.0f, 128.0f, 200.0f)
                close()
                moveTo(48.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.34f, -5.66f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(72.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 120.0f)
                close()
                moveTo(160.0f, 51.31f)
                lineTo(188.69f, 80.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
