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

public val FillGroup.HandEye: ImageVector
    get() {
        if (_handEye != null) {
            return _handEye!!
        }
        _handEye = Builder(name = "HandEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 180.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 144.0f, 180.0f)
                close()
                moveTo(216.0f, 104.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, -176.0f, 0.0f)
                lineTo(40.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(179.58f, 178.21f)
                curveToRelative(-0.7f, -1.4f, -17.5f, -34.21f, -51.58f, -34.21f)
                reflectiveCurveToRelative(-50.88f, 32.81f, -51.58f, 34.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 3.58f)
                curveToRelative(0.7f, 1.4f, 17.5f, 34.21f, 51.58f, 34.21f)
                reflectiveCurveToRelative(50.88f, -32.81f, 51.58f, -34.21f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 179.58f, 178.21f)
                close()
            }
        }
        .build()
        return _handEye!!
    }

private var _handEye: ImageVector? = null
