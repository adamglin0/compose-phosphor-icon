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

public val FillGroup.Briefcasemetal: ImageVector
    get() {
        if (_briefcasemetal != null) {
            return _briefcasemetal!!
        }
        _briefcasemetal = Builder(name = "Briefcasemetal", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 112.0f)
                lineTo(228.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(28.0f, 160.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(24.0f, 116.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 28.0f, 112.0f)
                close()
                moveTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(28.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                close()
                moveTo(232.0f, 72.0f)
                lineTo(232.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(28.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(24.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 56.0f)
                lineTo(80.0f, 56.0f)
                lineTo(80.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, 24.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 72.0f)
                close()
                moveTo(160.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(104.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _briefcasemetal!!
    }

private var _briefcasemetal: ImageVector? = null
