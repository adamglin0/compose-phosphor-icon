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

public val BoldGroup.Teabag: ImageVector
    get() {
        if (_teabag != null) {
            return _teabag!!
        }
        _teabag = Builder(name = "Teabag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                verticalLineTo(64.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 92.0f, 64.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(76.53f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -17.15f, 9.71f)
                lineTo(38.85f, 111.92f)
                arcTo(20.07f, 20.07f, 0.0f, false, false, 36.0f, 122.22f)
                verticalLineTo(216.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(122.22f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -2.85f, -10.29f)
                lineTo(148.62f, 77.71f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 131.47f, 68.0f)
                horizontalLineTo(116.0f)
                verticalLineTo(64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(129.21f, 92.0f)
                lineTo(148.0f, 123.32f)
                verticalLineTo(212.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(123.32f)
                lineTo(78.79f, 92.0f)
                horizontalLineTo(92.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(92.0f)
                close()
            }
        }
        .build()
        return _teabag!!
    }

private var _teabag: ImageVector? = null
