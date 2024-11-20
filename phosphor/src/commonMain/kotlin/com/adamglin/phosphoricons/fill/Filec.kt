package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.FileC: ImageVector
    get() {
        if (_fileC != null) {
            return _fileC!!
        }
        _fileC = Builder(name = "FileC", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 180.0f)
                curveToRelative(0.0f, 11.0f, 7.18f, 20.0f, 16.0f, 20.0f)
                arcToRelative(14.07f, 14.07f, 0.0f, false, false, 10.07f, -4.51f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, true, 10.88f, -0.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.83f, 11.81f)
                arcTo(30.06f, 30.06f, 0.0f, false, true, 64.0f, 216.0f)
                curveToRelative(-17.65f, 0.0f, -32.0f, -16.15f, -32.0f, -36.0f)
                reflectiveCurveToRelative(14.35f, -36.0f, 32.0f, -36.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 21.39f, 9.19f)
                arcToRelative(8.26f, 8.26f, 0.0f, false, true, 0.73f, 11.09f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.9f, 0.38f)
                arcTo(14.24f, 14.24f, 0.0f, false, false, 64.0f, 160.0f)
                curveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f)
                close()
                moveTo(216.0f, 88.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(116.0f, 232.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(112.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(44.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.66f, 2.34f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(196.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
            }
        }
        .build()
        return _fileC!!
    }

private var _fileC: ImageVector? = null
