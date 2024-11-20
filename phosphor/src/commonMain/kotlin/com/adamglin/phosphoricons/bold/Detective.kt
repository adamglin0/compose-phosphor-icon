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

public val BoldGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 104.0f)
                lineTo(219.21f, 104.0f)
                lineTo(175.82f, 44.24f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -31.61f, -0.94f)
                lineTo(131.39f, 58.16f)
                curveToRelative(-0.1f, 0.11f, -0.2f, 0.23f, -0.29f, 0.35f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.2f, 0.0f)
                curveToRelative(-0.09f, -0.12f, -0.19f, -0.24f, -0.29f, -0.35f)
                lineTo(111.79f, 43.3f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -31.61f, 0.94f)
                lineTo(36.79f, 104.0f)
                lineTo(12.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(244.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(96.62f, 62.45f)
                lineToRelative(9.69f, 11.24f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 43.38f, 0.0f)
                lineToRelative(9.69f, -11.24f)
                lineTo(189.55f, 104.0f)
                lineTo(66.45f, 104.0f)
                close()
                moveTo(180.0f, 140.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, -38.16f, 28.0f)
                lineTo(114.16f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 24.0f)
                horizontalLineToRelative(27.68f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 180.0f, 140.0f)
                close()
                moveTo(76.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 196.0f)
                close()
                moveTo(180.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 180.0f, 196.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
