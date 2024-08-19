package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 112.0f)
                lineTo(220.08f, 112.0f)
                lineToRelative(-47.5f, -65.41f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.31f, -0.72f)
                lineToRelative(-12.85f, 14.9f)
                lineToRelative(-0.2f, 0.23f)
                arcToRelative(7.95f, 7.95f, 0.0f, false, true, -12.44f, 0.0f)
                lineToRelative(-0.2f, -0.23f)
                lineToRelative(-12.85f, -14.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -25.31f, 0.72f)
                lineTo(35.92f, 112.0f)
                lineTo(8.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(248.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(96.34f, 56.0f)
                lineToRelative(0.19f, 0.23f)
                lineToRelative(12.85f, 14.89f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 37.24f, 0.0f)
                lineToRelative(12.85f, -14.89f)
                curveToRelative(0.06f, -0.08f, 0.1f, -0.15f, 0.17f, -0.23f)
                lineToRelative(40.66f, 56.0f)
                lineTo(55.69f, 112.0f)
                close()
                moveTo(180.0f, 144.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -35.77f, 32.0f)
                lineTo(111.77f, 176.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -1.83f, 16.0f)
                horizontalLineToRelative(36.12f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 180.0f, 144.0f)
                close()
                moveTo(76.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 200.0f)
                close()
                moveTo(180.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 180.0f, 200.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
