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

public val FillGroup.Couch: ImageVector
    get() {
        if (_couch != null) {
            return _couch!!
        }
        _couch = Builder(name = "Couch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 100.0f)
                lineTo(16.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 32.0f, 56.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(76.0f)
                lineTo(64.0f, 136.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(20.0f, 104.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 100.0f)
                close()
                moveTo(224.0f, 104.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(240.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(140.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(76.0f)
                horizontalLineToRelative(56.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 224.0f, 104.0f)
                close()
                moveTo(232.0f, 120.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(56.0f, 152.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(24.0f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 136.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(15.73f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 39.47f, 208.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 200.0f)
                lineTo(48.0f, 184.0f)
                lineTo(208.0f, 184.0f)
                verticalLineToRelative(15.73f)
                arcToRelative(8.17f, 8.17f, 0.0f, false, false, 7.47f, 8.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.53f, -8.0f)
                lineTo(224.0f, 184.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.0f, 136.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 120.0f)
                close()
            }
        }
        .build()
        return _couch!!
    }

private var _couch: ImageVector? = null
