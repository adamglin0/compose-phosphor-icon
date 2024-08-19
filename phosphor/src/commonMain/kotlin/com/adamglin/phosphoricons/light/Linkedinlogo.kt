package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Linkedinlogo: ImageVector
    get() {
        if (_linkedinlogo != null) {
            return _linkedinlogo!!
        }
        _linkedinlogo = Builder(name = "Linkedinlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 26.0f)
                lineTo(40.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 40.0f)
                lineTo(26.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 26.0f)
                close()
                moveTo(218.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(38.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(94.0f, 112.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(82.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(182.0f, 140.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(170.0f, 140.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, -44.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(114.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(2.11f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 182.0f, 140.0f)
                close()
                moveTo(98.0f, 84.0f)
                arcTo(10.0f, 10.0f, 0.0f, true, true, 88.0f, 74.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 98.0f, 84.0f)
                close()
            }
        }
        .build()
        return _linkedinlogo!!
    }

private var _linkedinlogo: ImageVector? = null
