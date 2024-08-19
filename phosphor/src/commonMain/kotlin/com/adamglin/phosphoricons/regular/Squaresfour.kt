package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Squaresfour: ImageVector
    get() {
        if (_squaresfour != null) {
            return _squaresfour!!
        }
        _squaresfour = Builder(name = "Squaresfour", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 56.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(120.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 40.0f)
                close()
                moveTo(104.0f, 104.0f)
                lineTo(56.0f, 104.0f)
                lineTo(56.0f, 56.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(200.0f, 40.0f)
                lineTo(152.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(200.0f, 104.0f)
                lineTo(152.0f, 104.0f)
                lineTo(152.0f, 56.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(104.0f, 136.0f)
                lineTo(56.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(120.0f, 152.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 136.0f)
                close()
                moveTo(104.0f, 200.0f)
                lineTo(56.0f, 200.0f)
                lineTo(56.0f, 152.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                close()
                moveTo(200.0f, 136.0f)
                lineTo(152.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 152.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 136.0f)
                close()
                moveTo(200.0f, 200.0f)
                lineTo(152.0f, 200.0f)
                lineTo(152.0f, 152.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _squaresfour!!
    }

private var _squaresfour: ImageVector? = null
