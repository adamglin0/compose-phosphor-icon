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

public val FillGroup.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.0f, 88.08f)
                curveToRelative(-0.4f, -1.0f, -0.82f, -2.0f, -1.25f, -3.0f)
                arcToRelative(87.93f, 87.93f, 0.0f, false, false, -30.17f, -37.0f)
                lineTo(216.0f, 48.08f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(112.0f, 32.08f)
                arcToRelative(88.12f, 88.12f, 0.0f, false, false, -87.72f, 81.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 0.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 8.57f, -14.16f)
                arcTo(87.69f, 87.69f, 0.0f, false, false, 46.0f, 178.22f)
                lineToRelative(12.56f, 35.16f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 73.64f, 224.0f)
                lineTo(86.36f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.07f, -10.62f)
                lineToRelative(1.92f, -5.38f)
                horizontalLineToRelative(57.3f)
                lineToRelative(1.92f, 5.38f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 177.64f, 224.0f)
                horizontalLineToRelative(12.72f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.07f, -10.62f)
                lineTo(221.64f, 168.0f)
                lineTo(224.0f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, -24.0f)
                lineTo(248.0f, 112.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 226.0f, 88.08f)
                close()
                moveTo(152.0f, 72.0f)
                lineTo(112.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(180.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 128.0f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
