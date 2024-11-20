package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.0f, 92.55f)
                reflectiveCurveToRelative(-0.05f, 0.0f, -0.09f, -0.07f)
                lineToRelative(-104.0f, -56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, 0.0f)
                lineToRelative(-104.0f, 56.0f)
                lineToRelative(-0.11f, 0.08f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, 3.45f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.09f, 0.07f)
                lineToRelative(104.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.8f, 0.0f)
                lineToRelative(104.0f, -56.0f)
                arcToRelative(0.27f, 0.27f, 0.0f, false, false, 0.08f, -0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.0f, -3.45f)
                lineTo(235.97f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.0f, 92.55f)
                close()
                moveTo(228.0f, 153.3f)
                lineTo(181.0f, 128.0f)
                lineToRelative(47.0f, -25.3f)
                close()
                moveTo(172.57f, 123.46f)
                lineTo(132.0f, 101.61f)
                lineTo(132.0f, 46.7f)
                lineTo(223.56f, 96.0f)
                close()
                moveTo(128.0f, 147.46f)
                lineTo(91.87f, 128.0f)
                lineTo(128.0f, 108.54f)
                lineTo(164.13f, 128.0f)
                close()
                moveTo(124.0f, 46.7f)
                verticalLineToRelative(54.91f)
                lineTo(83.43f, 123.46f)
                lineTo(32.44f, 96.0f)
                close()
                moveTo(28.0f, 102.7f)
                lineTo(75.0f, 128.0f)
                lineTo(28.0f, 153.3f)
                close()
                moveTo(83.43f, 132.54f)
                lineTo(124.0f, 154.39f)
                lineTo(124.0f, 209.3f)
                lineTo(32.44f, 160.0f)
                close()
                moveTo(132.0f, 209.3f)
                lineTo(132.0f, 154.39f)
                lineToRelative(40.57f, -21.85f)
                lineToRelative(51.0f, 27.46f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
