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

public val FillGroup.Teabag: ImageVector
    get() {
        if (_teabag != null) {
            return _teabag!!
        }
        _teabag = Builder(name = "Teabag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 136.0f)
                lineTo(112.0f, 72.0f)
                horizontalLineToRelative(19.47f)
                arcToRelative(16.09f, 16.09f, 0.0f, false, true, 13.72f, 7.77f)
                lineTo(165.72f, 114.0f)
                arcToRelative(16.06f, 16.06f, 0.0f, false, true, 2.28f, 8.24f)
                lineTo(168.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(56.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(40.0f, 122.22f)
                arcTo(16.06f, 16.06f, 0.0f, false, true, 42.28f, 114.0f)
                lineTo(62.81f, 79.77f)
                arcTo(16.09f, 16.09f, 0.0f, false, true, 76.53f, 72.0f)
                lineTo(96.0f, 72.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                close()
                moveTo(224.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(208.0f, 64.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 96.0f, 64.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(16.0f)
                lineTo(112.0f, 64.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 80.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _teabag!!
    }

private var _teabag: ImageVector? = null
