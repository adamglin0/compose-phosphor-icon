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

public val LightGroup.Baseballhelmet: ImageVector
    get() {
        if (_baseballhelmet != null) {
            return _baseballhelmet!!
        }
        _baseballhelmet = Builder(name = "Baseballhelmet", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 130.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, 26.0f, 26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 88.0f, 130.0f)
                close()
                moveTo(88.0f, 170.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 88.0f, 170.0f)
                close()
                moveTo(248.0f, 122.0f)
                lineTo(221.83f, 122.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 18.0f, 128.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, 70.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(70.08f, 70.08f, 0.0f, false, false, 70.0f, -70.0f)
                lineTo(198.0f, 134.0f)
                horizontalLineToRelative(50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(186.0f, 152.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, true, -58.0f, 58.0f)
                horizontalLineToRelative(-0.85f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 158.0f, 152.0f)
                lineTo(158.0f, 134.0f)
                horizontalLineToRelative(28.0f)
                close()
                moveTo(152.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -116.0f, 0.0f)
                lineTo(30.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 179.8f, -6.0f)
                close()
            }
        }
        .build()
        return _baseballhelmet!!
    }

private var _baseballhelmet: ImageVector? = null
