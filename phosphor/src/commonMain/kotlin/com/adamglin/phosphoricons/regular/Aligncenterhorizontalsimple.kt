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

public val RegularGroup.AlignCenterHorizontalSimple: ImageVector
    get() {
        if (_alignCenterHorizontalSimple != null) {
            return _alignCenterHorizontalSimple!!
        }
        _alignCenterHorizontalSimple = Builder(name = "AlignCenterHorizontalSimple", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 80.0f)
                lineTo(136.0f, 80.0f)
                lineTo(136.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 80.0f)
                lineTo(48.0f, 80.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 176.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(224.0f, 96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 208.0f, 80.0f)
                close()
                moveTo(208.0f, 160.0f)
                lineTo(48.0f, 160.0f)
                lineTo(48.0f, 96.0f)
                lineTo(208.0f, 96.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _alignCenterHorizontalSimple!!
    }

private var _alignCenterHorizontalSimple: ImageVector? = null
