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

public val LightGroup.Hospital: ImageVector
    get() {
        if (_hospital != null) {
            return _hospital!!
        }
        _hospital = Builder(name = "Hospital", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 210.0f)
                lineTo(238.0f, 210.0f)
                lineTo(238.0f, 128.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(166.0f, 114.0f)
                lineTo(166.0f, 48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(56.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 48.0f)
                lineTo(42.0f, 210.0f)
                lineTo(32.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(248.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(224.0f, 126.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(82.0f)
                lineTo(166.0f, 210.0f)
                lineTo(166.0f, 126.0f)
                close()
                moveTo(54.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(154.0f, 210.0f)
                lineTo(134.0f, 210.0f)
                lineTo(134.0f, 160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(80.0f, 154.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(50.0f)
                lineTo(54.0f, 210.0f)
                close()
                moveTo(122.0f, 210.0f)
                lineTo(86.0f, 210.0f)
                lineTo(86.0f, 166.0f)
                horizontalLineToRelative(36.0f)
                close()
                moveTo(74.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(98.0f, 90.0f)
                lineTo(98.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(110.0f, 90.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(110.0f, 102.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(98.0f, 102.0f)
                lineTo(80.0f, 102.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 74.0f, 96.0f)
                close()
            }
        }
        .build()
        return _hospital!!
    }

private var _hospital: ImageVector? = null
