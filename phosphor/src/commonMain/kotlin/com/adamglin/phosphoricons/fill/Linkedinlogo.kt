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

public val FillGroup.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) {
            return _linkedinLogo!!
        }
        _linkedinLogo = Builder(name = "LinkedinLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 24.0f)
                lineTo(40.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 40.0f)
                lineTo(24.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 216.0f, 24.0f)
                close()
                moveTo(96.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(80.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(88.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 96.0f)
                close()
                moveTo(184.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(168.0f, 140.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(112.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.79f, -1.78f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 184.0f, 140.0f)
                close()
            }
        }
        .build()
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
